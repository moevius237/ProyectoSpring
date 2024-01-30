package com.example.ProyectoSpring.controller;

import com.example.ProyectoSpring.entities.Anime;
import com.example.ProyectoSpring.repository.AnimeRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import java.util.List;

public interface AnimesApi {
    @Operation(
            summary = "Retrieve a list of animes",
            description = "Get all the animes that are created",
            tags = {"get","Anime"}
    )

    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Success",
                    content = {@Content(schema = @Schema(implementation = Anime.class))}),
            @ApiResponse(responseCode = "404")
    })
    List<Anime> getAnime();
}
