package com.sszkolud.microservices.book.socialmultiplication.service;

import com.sszkolud.microservices.book.socialmultiplication.domain.Multiplication;
import com.sszkolud.microservices.book.socialmultiplication.domain.MultiplicationResultAttempt;

public interface MultiplicationService {

    Multiplication createRandomMultiplication();
    boolean checkAttempt(final MultiplicationResultAttempt multiplicationResultAttempt);
}
