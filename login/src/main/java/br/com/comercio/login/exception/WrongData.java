package br.com.comercio.login.exception;

import br.com.comercio.login.dto.ErrorDTO;

import java.util.Date;

public class WrongData extends BusinessException {
    @Override
    public ErrorDTO getError() {
        return new ErrorDTO("ER01", "Dados informádos inválidos", new Date());
    }
}
