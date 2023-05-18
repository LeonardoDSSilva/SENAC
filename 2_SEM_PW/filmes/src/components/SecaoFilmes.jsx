import CardFilme from "./CardFilme"

export default function SecaoFilmes(props) {
	const {filmes} = props
	return (
		filmes.map(filme => <CardFilme filme={filme} />)
	)
}