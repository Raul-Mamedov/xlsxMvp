package com.example.xlsx;

import com.example.xlsx.exeption.StorageFileNotFoundException;
import com.example.xlsx.service.StorageService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.nio.file.Paths;
import java.util.stream.Stream;

import org.hamcrest.Matchers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.multipart;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@AutoConfigureMockMvc
@SpringBootTest
class XlsxApplicationTests {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private StorageService storageService;


    @Test
    public void shouldListAllFiles() throws Exception {
        given(this.storageService.loadAll()).willReturn(Stream.of(Paths.get("first.xlsx"), Paths.get("second.xlsx")));

        this.mvc.perform(get("/")).andExpect(status().isOk()).andExpect(model().attribute("files", Matchers.contains("http://localhost/files/first.xlsx", "http://localhost/files/second.xlsx")));
    }

    @Test
    public void shouldSaveUploadedFile() throws Exception {
        MockMultipartFile multipartFile = new MockMultipartFile("file", "test.xlsx", "xlsx/plain", "Spring Framework".getBytes());
        this.mvc.perform(multipart("/").file(multipartFile)).andExpect(status().isFound()).andExpect(header().string("Location", "/"));

        then(this.storageService).should().store(multipartFile);
    }


    @SuppressWarnings("unchecked")
    @Test
    public void should404WhenMissingFile() throws Exception {
        given(this.storageService.loadAsResource("test.xlsx")).willThrow(StorageFileNotFoundException.class);

        this.mvc.perform(get("/files/test.xlsx")).andExpect(status().isNotFound());
    }

}


