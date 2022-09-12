package br.com.projeto.pb_quiz.dao;


	import java.util.List;

	import javax.persistence.EntityManager;
	import br.com.pb.projeto.quiz.modelo.Questao;


	public class pergDAO {

		private EntityManager em;
		
		public QuestaoDAO(EntityManager em) {
			this.em = em;
		}
		
		public List<Questao> pegaQuestoes() {
			String jpql = "SELECT q FROM Questao q";
			
			return em.createQuery(jpql, Questao.class).getResultList();
		}
}
