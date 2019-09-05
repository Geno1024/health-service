package com.geno1024.health.services

import java.io.File

object Disk
{
    fun getLogicalDisks() = File.listRoots().asList()
}
