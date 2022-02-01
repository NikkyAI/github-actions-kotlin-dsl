package it.krzeminski.githubactions.domain

data class Job(
    val name: String,
    val runsOn: RunnerType,
    val steps: List<Step>,
    val needs: List<Job> = emptyList(),
    val condition: String? = null,
    val strategyMatrix: Map<String, List<String>>? = null,
)
