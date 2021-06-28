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

package com.example.demo.service;

import com.example.demo.entity.Book;

import java.util.List;

/**
 * https://cmcts.com.vn/.
 *
 * @author hongn
 * @version 1.0
 * @created_by hongn
 * @created_date 28/06/2021 08:59
 * @updated_by hongn
 * @updated_date 28/06/2021 08:59
 * @since 28/06/2021 08:59
 */
public interface BookService {
    List<Book> getAllBook();

    String createBook(Book book);
}
