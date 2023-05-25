import PlayCircleFilledWhiteIcon from '@mui/icons-material/PlayCircleFilledWhite';
import Link from 'next/link';

export default function Header() {
	return (
		<header className = 'flex w-100 justify-between bg-slate-800'>
			<Link href="/" className="flex m-4 text-amber-400">
				<PlayCircleFilledWhiteIcon/>
				<h1 className="text-4xl"> Senac Filmes</h1>
			</Link>
			<Link className = 'm-4' href="/sobre">SOBRE</Link>
		</header>
	)
}