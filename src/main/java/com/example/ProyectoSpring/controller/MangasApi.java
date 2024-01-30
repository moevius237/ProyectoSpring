package com.example.ProyectoSpring.controller;

import com.example.ProyectoSpring.entities.Anime;
import com.example.ProyectoSpring.entities.Manga;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import java.util.List;

public interface MangasApi {
    @Operation(
            summary = "Retrieve a list of manga",
            description = "Get all the manga that are created",
            tags = {"get","Manga"}
    )

    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Success",
                    content = {@Content(schema = @Schema(implementation = Manga.class))}),
            @ApiResponse(responseCode = "404")
    })
    List<Anime> getAnime();
}
