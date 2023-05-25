import CardFilme from "./CardFilme"

export default function SecaoFilmes(props) {
	const {filmes} = props
	return (
		<div className="flex flex-wrap">
			{filmes.map(filme => <CardFilme filme={filme} />)}
		</div>
	)
}