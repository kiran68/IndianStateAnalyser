package com.bridgelabz.indianstateanalyser;




public class CensusAnalyserException extends RuntimeException {

    enum ExceptionType {
        CENSUS_FILE_PROBLEM
    }

    ExceptionType type;

    public CensusAnalyserException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }

    public CensusAnalyserException(String message, Throwable cause, ExceptionType type) {
        super(message, cause);
        this.type = type;
    }

    public CensusAnalyserException(Throwable cause, ExceptionType type) {
        super(cause);
        this.type = type;
    }
}

