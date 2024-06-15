load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

# http_archive(
#     name = "bazel_gazelle",
#     urls = ["https://github.com/bazelbuild/bazel-gazelle/releases/download/v0.25.0/gazelle-v0.25.0.tar.gz"],
#     sha256 = "0b4f6aeb46d9086574456e82d4fce270d750f5b2326c568fc598eb948c8df6a3",
# )
http_archive(
    name = "bazel_gazelle",
    urls = ["https://github.com/bazelbuild/bazel-gazelle/releases/download/v0.37.0/bazel-gazelle-v0.37.0.tar.gz"],
)

load("@bazel_gazelle//:deps.bzl", "gazelle_dependencies")

gazelle_dependencies()

# load("@bazel_gazelle//:gazelle.bzl", "gazelle")

# gazelle(name = "gazelle")
