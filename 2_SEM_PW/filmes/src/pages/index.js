import SecaoFilmes from "@/components/SecaoFilmes";
import Titulo from "@/components/Titulo";
import Header from "@/components/Header";

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
		// <>  Fragment
		<>
		<Header/>


		<div>
			<img className="h-80 object-cover w-screen" src="https://www.themoviedb.org/t/p/original/ve7ABy1y0b19gcExYz1z9cDFPGB.jpg" alt="" />
		</div>

		<main className={`flex min-h-screen flex-col justify-between px-24`}>
			<Titulo>FILMES EM ALTA</Titulo>
			<div className="  justify-center gap-4">
				<SecaoFilmes filmes={filmes}/>
			</div>
			<Titulo>SÉRIES EM ALTA</Titulo>
			<Titulo>EM BREVE</Titulo>
			<Titulo>LANÇAMENTOS</Titulo>
		</main> //JSX
		</>
	)
}
