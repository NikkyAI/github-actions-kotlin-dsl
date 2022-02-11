package it.krzeminski.githubactions.wrappergenerator.domain.typings

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.asClassName

class ListOfStringsTyping(private val delimiter: String) : Typing {
    override val className: TypeName
        get() = List::class.asClassName().parameterizedBy(ClassName("kotlin", "String"))

    override fun asString() = ".joinToString(\"$delimiter\")"
}