import StarIcon from '@mui/icons-material/Star';
import StarOutlineIcon from '@mui/icons-material/StarOutline';
import { useState } from 'react';

export default function Card({conteudo}) {
	const [favorito, setFavorito] = useState(false);
	const img = conteudo.thumbnail.path + '.' + conteudo.thumbnail.extension;
  return (
	<div className="flex flex-col p-3 w-56">
		<div className="relative">
			{
				favorito ?
				<StarIcon className="absolute top-0 right-0 text-red-500 cursor-pointer" onClick={() => setFavorito(favorito)} />:
				<StarOutlineIcon className="absolute top-0 right-0 text-red-500 cursor-pointer" onClick={() => setFavorito(!favorito)} />
			}
			<img className={`rounded-lg`} src={img} />
		</div>
		<h4 className="text-xl my-4 line-clamp-1 w-fit" >{conteudo.name}</h4>
			<div className="flex justify-center items-center">
				<StarIcon className='text-amber-400'/>
				{/* <span className="text-lg" >{conteudo.note}</span> */}
			</div>
			<a className="rounded-lg bg-cyan-700 py-2 text-center" href="#">Detalhes</a>
	</div>
  );
}