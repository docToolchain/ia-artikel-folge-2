outputPath = 'build/docs'

// Path where the docToolchain will search for the input files.
// This path is appended to the docDir property specified in gradle.properties
// or in the command line, and therefore must be relative to it.


inputFiles = [
        [file: 'Part-2-DocToolchain.adoc',            formats: ['html','pdf']],
]

taskInputsDirs = ["${inputPath}/images"]

taskInputsFiles = []