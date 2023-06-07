import Card from "./Card";

export default function Secao(props) {
	const {conteudo} = props;
	return (
		<div className="  justify-center gap-4 flex flex-wrap">
			{conteudo.map(item => <Card conteudo={item} />)}
		</div>
	);
}