package com.fintech.product.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fintech.product.dto.ProductDTO;
import com.fintech.product.service.ProductService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import java.util.Collections;

@WebMvcTest(ProductController.class)
class ProductControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductService productService;

    @Test
    void getAllProducts() throws Exception {
        Mockito.when(productService.getAllProducts()).thenReturn(Collections.emptyList());
        mockMvc.perform(MockMvcRequestBuilders.get("/api/products"))
               .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void getProductById() throws Exception {
        Long id = 1L;
        ProductDTO productDTO = new ProductDTO(id, "Product 1", 10.0, 100, "Category 1");
        Mockito.when(productService.getProductById(id)).thenReturn(productDTO);
        mockMvc.perform(MockMvcRequestBuilders.get("/api/products/" + id))
               .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void createProduct() throws Exception {
        ProductDTO productDTO = new ProductDTO(null, "Product 1", 10.0, 100, "Category 1");
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(productDTO);
        mockMvc.perform(MockMvcRequestBuilders.post("/api/products")
                       .contentType(MediaType.APPLICATION_JSON)
                       .content(json))
               .andExpect(MockMvcResultMatchers.status().isCreated());
    }

    @Test
    void updateProduct() throws Exception {
        Long id = 1L;
        ProductDTO productDTO = new ProductDTO(id, "Product 1", 10.0, 100, "Category 1");
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(productDTO);
        mockMvc.perform(MockMvcRequestBuilders.put("/api/products/" + id)
                       .contentType(MediaType.APPLICATION_JSON)
                       .content(json))
               .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void deleteProduct() throws Exception {
        Long id = 1L;
        mockMvc.perform(MockMvcRequestBuilders.delete("/api/products/" + id))
               .andExpect(MockMvcResultMatchers.status().isNoContent());
    }
}