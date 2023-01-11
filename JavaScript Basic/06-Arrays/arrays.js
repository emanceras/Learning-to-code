const compra = ["pan", "leche", "carne", "pescado", "legumbres"]
const newCompra = compra.push("Aceite de Girasol")
const newCompra2 = compra.pop()
const movies = [
    {titulo: "Shrek", director: "Andrew Adamson", fecha: 2001},
    {titulo: "Star Wars", director: "George Lucas", fecha: 1977},
    {titulo: "Interstellar", director: "Cristopher Nolan", fecha: 2014}
]
const movie2010 = movies.filter(value => value.fecha > 2010)
const directorsMovie = movies.map(v => v.director)
const titulo = movies.map(v => v.titulo)
const directorYTitulo = directorsMovie.concat(titulo)
const x = [...directorsMovie,...titulo]