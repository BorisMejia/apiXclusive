package com.api.xclusive.service;

public enum Utilidad
{
    ERROR_AL_REGISTRAR_USUARIO("Error al registrar el usuario"),
    USUARIO_NO_ENCONTRADO("Usuario no encontrado"),
    ERROR_AL_BUSCAR_USUARIO("Error al buscar el usuario"),
    ERROR_AL_BUSCAR_LOS_USUARIOS("Error al buscar todos los usuarios"),
    ERROR_AL_EDITAR_USUARIO("Error al editar el usuario"),
    ERROR_AL_ELIMINAR_USUARIO("Error al eliminar usuario"),
    ERROR("Error");
    private String mensaje;

    Utilidad(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
