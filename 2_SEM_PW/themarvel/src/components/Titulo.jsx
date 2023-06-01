import MovieFilterIcon from '@mui/icons-material/MovieFilter';
import Diversity3Icon from '@mui/icons-material/Diversity3';
import AutoStoriesIcon from '@mui/icons-material/AutoStories';



export default function Titulo({children}) {
	const [icone, setIcone] = useState(children);

	return (
		<section className='text-lg border-l-4 border-red-500 px-2'>
		{
			switch (icone) {
				case 'FILMES':
					<MovieFilterIcon className='inline-block mr-2' />
					break;
				z
				
		}
			{children}
		</section>
	);
}