package com.aleengo.iconvert.dto;

import java.util.Optional;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by CK_ALEENGO on 14/02/2019.
 * Copyright (c) 2019. All rights reserved.
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {
    private Optional<Throwable> error;
    private Optional<T> value;
}
