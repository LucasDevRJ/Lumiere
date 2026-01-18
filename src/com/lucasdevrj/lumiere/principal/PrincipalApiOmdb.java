package com.lucasdevrj.lumiere.principal;

import com.lucasdevrj.lumiere.api.ApiOmdb;
import java.io.IOException;

public class PrincipalApiOmdb {

    public static void main(String[] args) throws IOException, InterruptedException {
        ApiOmdb apiOmdb = new ApiOmdb();
        apiOmdb.realizarRequisicao();
        apiOmdb.exibeJsonConvertidoEmObjetoTitulo();
        apiOmdb.exibeTituloConvertido();
    }
}
