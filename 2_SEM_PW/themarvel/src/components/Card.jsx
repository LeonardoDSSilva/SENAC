import StarIcon from '@mui/icons-material/Star';
import StarOutlineIcon from '@mui/icons-material/StarOutline';
import Link from 'next/link';
import { useState } from 'react';

export default function Card({ conteudo }) {
	const [favorito, setFavorito] = useState(false);
	const img = conteudo.thumbnail.path + '.' + conteudo.thumbnail.extension;
	return (
		<div className="flex flex-col p-3 w-56">
			<div className="group/edit relative ">
				{
					favorito ?
						<StarIcon className="absolute top-0 right-2 text-red-500 cursor-pointer" onClick={() => setFavorito(favorito)} /> :
						<StarOutlineIcon className="absolute top-0 right-2 text-red-500 cursor-pointer" onClick={() => setFavorito(!favorito)} />
				}
				<img className="rounded-lg h-60 " src={img} />
				<div className=" group-hover/edit:absolute group-hover/edit:inset-x-0 group-hover/edit:bottom-0 group-hover/edit:bg-red-900/75">
					<h4 className="group-hover/edit:text-xl group-hover/edit:my-4 group-hover/edit:line-clamp-1 group-hover/edit:w-fit" >{conteudo.name}</h4>

				</div>
			</div>
			{/* <a className="rounded-lg bg-cyan-700 py-2 text-center">Mais detalhes</a> */}
		</div>
	);
}