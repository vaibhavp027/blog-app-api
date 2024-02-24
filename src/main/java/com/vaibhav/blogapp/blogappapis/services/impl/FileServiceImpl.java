package com.vaibhav.blogapp.blogappapis.services.impl;

import com.vaibhav.blogapp.blogappapis.services.FileService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

@Service
public class FileServiceImpl implements FileService {

    @Override
    public String uploadImage(String path, MultipartFile file) throws IOException {
        String name = file.getOriginalFilename();

        //random name generate file
        String ramdomId = UUID.randomUUID().toString();
        String fileName1 = ramdomId.concat(name.substring(name.lastIndexOf(".")));

        //Full path
        String filePath = path + File.separator + fileName1;

        //Creating folder if not exists
        File f = new File(path);
        if (!f.exists()){
            f.mkdir();
        }

//        File copy
        Files.copy(file.getInputStream(), Paths.get(filePath));


        return fileName1;
    }

    @Override
    public InputStream getResource(String path, String fileName) throws FileNotFoundException {
        String fullPath = path + File.separator + fileName;
        return new FileInputStream(fullPath);
    }
}
