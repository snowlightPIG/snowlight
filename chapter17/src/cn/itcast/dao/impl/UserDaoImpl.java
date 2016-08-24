package cn.itcast.dao.impl;
/**
 * ʹ��hibernate.cfg.xml
 */
//import java.util.List;
//import org.springframework.orm.hibernate3.HibernateTemplate;
//import cn.itcast.dao.UserDao;
//import cn.itcast.domain.User;
//public class UserDaoImpl implements UserDao {
//	// �ṩhibernateģ��
//	private HibernateTemplate hibernateTemplate;
//	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
//		this.hibernateTemplate = hibernateTemplate;
//	}
//	public User findById(Integer id) {
//		return this.hibernateTemplate.get(User.class, id);
//	}
//	public List<User> findAll() {
//		return this.hibernateTemplate.find("from User");
//	}
//	public void save(User user) {
//		this.hibernateTemplate.save(user);
//	}
//	public void update(User user) {
//		this.hibernateTemplate.update(user);
//	}
//	public void delete(User user) {
//		this.hibernateTemplate.delete(user);
//	}
//}
/**
 * ��ʹ��hibernate.cfg.xml
 */
// import java.util.List;
// import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
// import cn.itcast.dao.UserDao;
// import cn.itcast.domain.User;
// //�̳� HibernateDaoSupport�Զ�����ģ��, �����ṩSessionFactory
// public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
// 	public User findById(Integer id) {
// 		return this.getHibernateTemplate().get(User.class, id);
// 		}
// 		public List<User> findAll() {
// 			return this.getHibernateTemplate().find("from User");
// 		}
// 		public void save(User user) {
// 			this.getHibernateTemplate().save(user);
// 		}
// 		public void update(User user) {
// 			this.getHibernateTemplate().update(user);
// 		}
// 		public void delete(User user) {
// 			this.getHibernateTemplate().delete(user);
// 		}
// 	}

/**
 * ʹ��ע�ⷽʽ
 */
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;

@Repository
public class UserDaoImpl implements UserDao {
	// �ṩhibernateģ��
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public User findById(Integer id) {
		return this.hibernateTemplate.get(User.class, id);
	}

	public List<User> findAll() {
		return this.hibernateTemplate.find("from User");
	}

	public void save(User user) {
		this.hibernateTemplate.save(user);
	}

	public void update(User user) {
		this.hibernateTemplate.update(user);
	}

	public void delete(User user) {
		this.hibernateTemplate.delete(user);
	}
}
