import Header from '../components/Header'
export default function Sobre() {
	return (
		<>
			<Header />
			<div className="flex flex-col items-center justify-center h-screen">
				<h1 className="text-6xl">Sobre o Senac </h1>
				<p className="text-2xl">Essa é a página sobre</p>
			</div>
		</>
	)
}