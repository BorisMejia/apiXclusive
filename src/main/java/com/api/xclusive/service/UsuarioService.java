package com.api.xclusive.service;

import com.api.xclusive.entity.Usuario;
import com.api.xclusive.repository.UsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService
{
    @Autowired
    UsuarioRepo usuarioRepo;

    //AGREGAR UN USUARIO
    public Usuario registrarUsuario(Usuario usuario)throws Exception
    {
        try {
           return this.usuarioRepo.save(usuario);
        }catch (Exception e)
        {
            throw new Exception(Utilidad.ERROR_AL_REGISTRAR_USUARIO.getMensaje());
        }
    }
    //BUSCAR UN USUARIO
    public Usuario buscarUnUsuario(Integer idUsuario)throws Exception
    {
        try
        {
            Optional<Usuario> buscarUsuario = this.usuarioRepo.findById(idUsuario);
            if(buscarUsuario.isPresent())
            {
                return buscarUsuario.get();
            }else
            {
                throw new Exception(Utilidad.USUARIO_NO_ENCONTRADO.getMensaje());
            }
        }catch (Exception e)
        {
            throw new Exception(Utilidad.ERROR_AL_BUSCAR_USUARIO.getMensaje());
        }
    }
    //BUSCAR TOD0S LOS USUARIOS
    public List<Usuario> buscarLosUsuarios()throws Exception
    {
        try {
            List<Usuario>listaUsuario = this.usuarioRepo.findAll();
            return listaUsuario;
        }catch (Exception e)
        {
            throw new Exception(Utilidad.ERROR_AL_BUSCAR_LOS_USUARIOS.getMensaje());
        }
    }
    //EDITAR USUARIO
    public Usuario editarUsuario(Integer idUsuario, Usuario usuario)throws Exception
    {
        try {
            Optional<Usuario> usuarioExistente = usuarioRepo.findById(idUsuario);
            if (usuarioExistente.isPresent())
            {
                usuario.setId(idUsuario);
                return usuarioRepo.save(usuario);
            }else
            {
                throw new Exception(Utilidad.USUARIO_NO_ENCONTRADO.getMensaje());
            }
        }catch (Exception e)
        {
            throw new Exception(Utilidad.ERROR_AL_EDITAR_USUARIO.getMensaje());
        }
    }
    public Boolean eliminarUsuario(Integer idUsuario)throws Exception
    {
        try {
            Boolean usuarioEncontrado= this.usuarioRepo.existsById(idUsuario);
            if (usuarioEncontrado)
            {
                this.usuarioRepo.deleteById(idUsuario);
                return true;
            }else
            {
                throw new Exception(Utilidad.USUARIO_NO_ENCONTRADO.getMensaje());
            }
        }catch (Exception e)
        {
            throw new Exception(Utilidad.ERROR_AL_ELIMINAR_USUARIO.getMensaje());
        }
    }

}
