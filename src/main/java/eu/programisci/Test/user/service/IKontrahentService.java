package eu.programisci.Test.user.service;

import eu.programisci.Test.user.dto.KontrahentDTO;
import eu.programisci.Test.user.dto.KontrahentForTableDTO;

import java.util.List;

public interface IKontrahentService {
    KontrahentDTO findOne(Long id);

    List<KontrahentForTableDTO> findAllForTable();

    void deleteOne(Long id);

    KontrahentDTO save(KontrahentDTO kontrahentDTO);
}
