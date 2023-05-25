import StarIcon from '@mui/icons-material/Star';
import FavoriteBorderIcon from '@mui/icons-material/FavoriteBorder';
import FavoriteIcon from '@mui/icons-material/Favorite';
import { useState } from 'react';

export default function CardFilme({filme}) {
	const [favorito, setFavorito] = useState(false)
	return (
		<div className={`flex flex-col p-3 w-56 `}>
			<div className='relative'>
				{
					favorito ? 
					<FavoriteIcon className= 'absolute top-2 right-2 text-amber-400 cursor-pointer' onClick={() => setFavorito(false)}/>:
					<FavoriteBorderIcon className= 'absolute top-2 right-2 text-amber-400 cursor-pointer' onClick={() => setFavorito(true)}/>
				}
				<img className={`rounded-lg`} src={filme.poster} />
			</div>
			<h4 className="text-xl my-4 line-clamp-1 w-fit" >{filme.titulo}</h4>
			<div className="flex justify-center items-center">
				<StarIcon className='text-amber-400'/>
				<span className="text-lg" >{filme.nota}</span>
			</div>
			<a className="rounded-lg bg-cyan-700 py-2 text-center" href="#">Detalhes</a>
		</div>
	)
}