package com.wcsm.applistatarefas.database

import com.wcsm.applistatarefas.model.Tarefa

interface ITarefaDAO {
    fun salvar(tarefa: Tarefa): Boolean
    fun atualizar(tarefa: Tarefa): Boolean
    fun remover(idTarefa: Int): Boolean
    fun listar(): List<Tarefa>
}