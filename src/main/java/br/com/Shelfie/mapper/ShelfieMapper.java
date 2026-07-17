package br.com.Shelfie.mapper;

import br.com.Shelfie.dto.ShelfieDTO;
import br.com.Shelfie.entity.ShelfieModel;
import org.springframework.stereotype.Component;

@Component
public class ShelfieMapper {

    public ShelfieModel toModel(ShelfieDTO shelfieDTO) {
        ShelfieModel shelfieModel = new ShelfieModel();

        shelfieModel.setId(shelfieDTO.getId());
        shelfieModel.setTitulo(shelfieDTO.getTitulo());
        shelfieModel.setAutor(shelfieDTO.getAutor());
        shelfieModel.setGenero(shelfieDTO.getGenero());
        shelfieModel.setNumPaginas(shelfieDTO.getNumPaginas());
        shelfieModel.setStatusDeLeitura(shelfieDTO.getStatusDeLeitura());
        shelfieModel.setAvaliacao(shelfieDTO.getAvaliacao());

        return shelfieModel;
    }

    public ShelfieDTO toDto(ShelfieModel shelfieModel) {
        ShelfieDTO shelfieDTO = new ShelfieDTO();

        shelfieDTO.setId(shelfieModel.getId());
        shelfieDTO.setTitulo(shelfieModel.getTitulo());
        shelfieDTO.setAutor(shelfieModel.getAutor());
        shelfieDTO.setGenero(shelfieModel.getGenero());
        shelfieDTO.setNumPaginas(shelfieModel.getNumPaginas());
        shelfieDTO.setStatusDeLeitura(shelfieModel.getStatusDeLeitura());
        shelfieDTO.setAvaliacao(shelfieModel.getAvaliacao());

        return shelfieDTO;
    }
}
