package com.nag.jokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesServicesImpl implements JokesService{

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesServicesImpl() {

        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJokes() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
