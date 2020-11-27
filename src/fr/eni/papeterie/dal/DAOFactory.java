package fr.eni.papeterie.dal;

public class DAOFactory {

    public static ArticleDAO getArticleDAO() {
        ArticleDAO articleDAO = null;
        try {
            articleDAO = (ArticleDAO) Class.forName("fr.eni.papeterie.dal.jdbc.ArticleDAOJdbcImpl").newInstance();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return articleDAO;

    }


}
