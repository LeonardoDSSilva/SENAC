export default function CardFilme({filme}) {
	return (
		<div className={`flex flex-col p-3 w-56 `}>
			<img className={`rounded-lg`} src={filme.poster} />
			<h4 className="text-xl my-4 line-clamp-1 w-fit" >{filme.titulo}</h4>
			<div className="text-center">
				⭐
				<span className="text-lg" >{filme.nota}</span>
			</div>
			<a className="rounded-lg bg-cyan-700 py-2 text-center" href="#">Detalhes</a>
		</div>
	)
}