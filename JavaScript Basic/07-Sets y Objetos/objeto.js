const datosPersonales = {nombre: "Eduardo", apellido: "Manceras", edad: 26, altura: 1.96, eresDesarrollador: true}
const age = datosPersonales.edad
const datos2 = [{...datosPersonales}, {nombre: "Adolfo", apellido: "Jiménez", edad: 27, altura: 1.78, eresDesarrollador: false}, {nombre: "Manuel", apellido: "Espinosa", edad: 27, altura: 1.68, eresDesarrollador: false}]
const datos3 = datos2.sort((a,b) => b.edad - a.edad)