import MovieFilterIcon from '@mui/icons-material/MovieFilter';
import Diversity3Icon from '@mui/icons-material/Diversity3';
import AutoStoriesIcon from '@mui/icons-material/AutoStories';



export default function Titulo({children}) {
	return (
		<section className='text-lg border-l-4 border-red-500 px-2'>
			<span className='font-bold'>{children} </span>
			{
				{
					'HQs': <AutoStoriesIcon className='inline-block mr-2' />,
					'Personagens': <Diversity3Icon className='inline-block mr-2' />,
					'FILMES': <MovieFilterIcon className='inline-block mr-2' />
				}[children]
			}
		</section>
	);
}