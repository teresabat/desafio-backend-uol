package teresa.bat.desafio_uol_backend.model.dtos;

import teresa.bat.desafio_uol_backend.model.GroupType;

public record PlayerDto(
        String name,
        String email,
        String phoneNumber,
        GroupType groupType
) {
}
