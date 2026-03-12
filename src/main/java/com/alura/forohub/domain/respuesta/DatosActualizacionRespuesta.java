package com.alura.forohub.domain.respuesta;

import jakarta.validation.constraints.NotBlank;

public record DatosActualizacionRespuesta(@NotBlank String mensaje) {

}
