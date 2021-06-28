/*
 * Copyright (c) 2019, 2020 https://cmcts.com.vn/ and/or its affiliates. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.demo.controllers;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * https://cmcts.com.vn/.
 *
 * @author hongn
 * @version 1.0
 * @created_by hongn
 * @created_date 28/06/2021 08:35
 * @updated_by hongn
 * @updated_date 28/06/2021 08:35
 * @since 28/06/2021 08:35
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired
    BookService bookService;

    @GetMapping("/getData")
    public List<Book> getAllTutorials() {
        return bookService.getAllBook();
    }

    @PostMapping("/createBook")
    public String createBook(@RequestBody Book book){

        return bookService.createBook(book);
    }
}
