rootProject.name = "dokyu-backend"

include("server")
findProject(":server")?.name = "dokyu-backend"