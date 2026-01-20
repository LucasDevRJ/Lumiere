package com.lucasdevrj.lumiere.principal;

import com.lucasdevrj.lumiere.arquivo.ApiOmdbArquivo;

import java.io.IOException;

public class PrincipalApiOmdbArquivo {
    public static void main(String[] args) throws IOException, InterruptedException {
        ApiOmdbArquivo apiOmdbArquivo = new ApiOmdbArquivo();
        apiOmdbArquivo.consumirApi();
    }
}
