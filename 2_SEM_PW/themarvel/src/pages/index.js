import Header from "@/components/Header";
import Secao from "@/components/Secao";
import Titulo from "@/components/Titulo";
import { useState } from "react";

export default function Home() {
	const [characters, setCharacters] = useState([]);
	const url = `${process.env.NEXT_PUBLIC_MARVEL_API_URL}characters?ts=${process.env.NEXT_PUBLIC_MARVEL_API_TS}&apikey=${process.env.NEXT_PUBLIC_MARVEL_API_KEY}&hash=${process.env.NEXT_PUBLIC_MARVEL_API_HASH}&limit=30`;
	fetch(url)
	.then(response => response.json())
	.then(response => setCharacters(response.data.results))
	// .then(response => console.log(response.data.results))

	.catch(err => console.error(err));
	console.log(characters)



	return (
		<>
			<Header />
			<main>
				<div className="h-96"></div>
				<Titulo>Personagens</Titulo>
				<Secao conteudo={characters} />



			</main>
		</>
	)
}
