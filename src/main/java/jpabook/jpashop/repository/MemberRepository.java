package jpabook.jpashop.repository;

import jpabook.jpashop.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class MemberRepository {
    private EntityManager em;

    @Autowired
    public MemberRepository(EntityManager em) {
        this.em = em;
    }

    public Long save(Member member)
    {
        em.persist(member);
        return member.getId();
    }

    public Member findOne(Long id)
    {
        return em.find(Member.class, id);
    }

    public List<Member> findAll()
    {
        // use JPQL
        return em.createQuery("select m from Member m", Member.class)
        .getResultList();
    }

    public List<Member> findByName(String name)
    {
        return em.createQuery("select m from Member m where m.name = :name", Member.class)
                .setParameter("name", name)
                .getResultList();
    }
}
