import Header from "@/components/Header";
import Secao from "@/components/Secao";
import Titulo from "@/components/Titulo";

export default function Home() {
	const url = `${process.env.NEXT_PUBLIC_MARVEL_API_URL}characters?ts=${process.env.NEXT_PUBLIC_MARVEL_API_TS}&apikey=${process.env.NEXT_PUBLIC_MARVEL_API_KEY}&hash=${process.env.NEXT_PUBLIC_MARVEL_API_HASH}&limit=10`;
	console.log(url);

	fetch(url)
	.then(response => response.json())
	.then(response => console.log(response))
	.catch(err => console.error(err));


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
		<>
			<Header />
			<main>
				<div className="h-96"></div>
				<Titulo>FILMES</Titulo>
				<Secao conteudo={filmes} />
				<Titulo>ANIMES</Titulo>

				<Titulo>HQs</Titulo>
				<Titulo>DESENHOS</Titulo>
				<Titulo>HEROIS</Titulo>
				<Titulo>SAGAS</Titulo>


			</main>
		</>
	)
}
