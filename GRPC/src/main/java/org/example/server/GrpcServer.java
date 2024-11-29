package org.example.server;

import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.example.services.BankGrpcService;

import java.io.IOException;

public class GrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Création et configuration du serveur gRPC
        Server server = ServerBuilder.forPort(5555)
                .addService((BindableService) new BankGrpcService())
                .build();

        server.start();
        System.out.println("Server started, listening on port 5555");


        server.awaitTermination();
    }
}

