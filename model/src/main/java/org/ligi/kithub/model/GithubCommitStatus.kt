package org.ligi.kithub.model

data class GithubCommitStatus(val state: GithubCommitState, val target_url: String, val description: String, val context: String)