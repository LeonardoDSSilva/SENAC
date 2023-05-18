import SecaoFilmes from "@/components/SecaoFilmes";
import Titulo from "@/components/Titulo";

export default function Home() {

	const filmes = [
		{
			titulo: "Super Mario Bros",
			nota: 5.5,
			poster: "https://www.themoviedb.org/t/p/w300_and_h450_bestv2/qNBAXBIQlnOThrVvA6mA2B5ggV6.jpg",
		},
		{
			titulo: "Mae",
			nota: 5.5,
			poster: "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/jPLNkniLLLsnvqRDncIyFyTcXsN.jpg",
		}
	]

	return (
		<main className={`flex min-h-screen flex-col justify-between p-24`}>
			<Titulo>FILMES EM ALTA</Titulo>
			<div className="flex flex-wrap justify-center gap-4">
				<SecaoFilmes filmes={filmes}/>
			</div>
			<Titulo>SÉRIES EM ALTA</Titulo>
			<Titulo>EM BREVE</Titulo>
			<Titulo>LANÇAMENTOS</Titulo>
		</main> //JSX
	)
}
