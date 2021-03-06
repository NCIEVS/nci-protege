package edu.stanford.bmir.protegex.chao.annotation.api;

import java.util.ArrayList;
import java.util.Collection;

import edu.stanford.bmir.protegex.chao.annotation.api.impl.DefaultAdvice;
import edu.stanford.bmir.protegex.chao.annotation.api.impl.DefaultAgreeDisagreeVote;
import edu.stanford.bmir.protegex.chao.annotation.api.impl.DefaultAgreeDisagreeVoteProposal;
import edu.stanford.bmir.protegex.chao.annotation.api.impl.DefaultAnnotation;
import edu.stanford.bmir.protegex.chao.annotation.api.impl.DefaultChangeHierarchyProposal;
import edu.stanford.bmir.protegex.chao.annotation.api.impl.DefaultComment;
import edu.stanford.bmir.protegex.chao.annotation.api.impl.DefaultExample;
import edu.stanford.bmir.protegex.chao.annotation.api.impl.DefaultExplanation;
import edu.stanford.bmir.protegex.chao.annotation.api.impl.DefaultFiveStarsVote;
import edu.stanford.bmir.protegex.chao.annotation.api.impl.DefaultFiveStarsVoteProposal;
import edu.stanford.bmir.protegex.chao.annotation.api.impl.DefaultLinguisticEntity;
import edu.stanford.bmir.protegex.chao.annotation.api.impl.DefaultMergeProposal;
import edu.stanford.bmir.protegex.chao.annotation.api.impl.DefaultNewEntityProposal;
import edu.stanford.bmir.protegex.chao.annotation.api.impl.DefaultPropertyValueChangeProposal;
import edu.stanford.bmir.protegex.chao.annotation.api.impl.DefaultQuestion;
import edu.stanford.bmir.protegex.chao.annotation.api.impl.DefaultRetireProposal;
import edu.stanford.bmir.protegex.chao.annotation.api.impl.DefaultReview;
import edu.stanford.bmir.protegex.chao.annotation.api.impl.DefaultReviewRequest;
import edu.stanford.bmir.protegex.chao.annotation.api.impl.DefaultSeeAlso;
import edu.stanford.bmir.protegex.chao.annotation.api.impl.DefaultSimpleProposal;
import edu.stanford.bmir.protegex.chao.annotation.api.impl.DefaultSplitProposal;
import edu.stanford.bmir.protegex.chao.annotation.api.impl.DefaultStatus;
import edu.stanford.bmir.protegex.chao.ontologycomp.api.impl.DefaultTimestamp;
import edu.stanford.smi.protege.code.generator.wrapping.AbstractWrappedInstance;
import edu.stanford.smi.protege.code.generator.wrapping.OntologyJavaMappingUtil;
import edu.stanford.smi.protege.model.Cls;
import edu.stanford.smi.protege.model.Instance;
import edu.stanford.smi.protege.model.KnowledgeBase;
import edu.stanford.smi.protege.model.Slot;

/**
 * Generated by Protege (http://protege.stanford.edu).
 * 
 * @version generated on Mon Aug 18 21:11:09 GMT-08:00 2008
 */
public class AnnotationFactory {
    static {
        OntologyJavaMapping.initMap();
    }

    private KnowledgeBase kb;

    public AnnotationFactory(KnowledgeBase kb) {
        this.kb = kb;
    }

    // ***** Class Advice *****

    public Cls getAdviceClass() {
        final String name = "Advice";
        return kb.getCls(name);
    }

    public Advice createAdvice(String name) {
        Cls cls = getAdviceClass();
        Instance inst = cls.createDirectInstance(name);
        return new DefaultAdvice(inst);
    }

    public Advice getAdvice(String name) {
        return OntologyJavaMappingUtil.getSpecificObject(kb, kb.getInstance(name), Advice.class);
    }

    public Collection<Advice> getAllAdviceObjects() {
        return getAllAdviceObjects(false);
    }

    public Collection<Advice> getAllAdviceObjects(boolean transitive) {
        Collection<Advice> result = new ArrayList<Advice>();
        final Cls cls = getAdviceClass();
        for (Object element : transitive ? cls.getInstances() : cls.getDirectInstances()) {
            Instance inst = (Instance) element;
            result.add(OntologyJavaMappingUtil.getSpecificObject(kb, inst, Advice.class));
        }
        return result;
    }

    // ***** Class AgreeDisagreeVote *****

    public Cls getAgreeDisagreeVoteClass() {
        final String name = "AgreeDisagreeVote";
        return kb.getCls(name);
    }

    public AgreeDisagreeVote createAgreeDisagreeVote(String name) {
        Cls cls = getAgreeDisagreeVoteClass();
        Instance inst = cls.createDirectInstance(name);
        return new DefaultAgreeDisagreeVote(inst);
    }

    public AgreeDisagreeVote getAgreeDisagreeVote(String name) {
        return OntologyJavaMappingUtil.getSpecificObject(kb, kb.getInstance(name), AgreeDisagreeVote.class);
    }

    public Collection<AgreeDisagreeVote> getAllAgreeDisagreeVoteObjects() {
        return getAllAgreeDisagreeVoteObjects(false);
    }

    public Collection<AgreeDisagreeVote> getAllAgreeDisagreeVoteObjects(boolean transitive) {
        Collection<AgreeDisagreeVote> result = new ArrayList<AgreeDisagreeVote>();
        final Cls cls = getAgreeDisagreeVoteClass();
        for (Object element : transitive ? cls.getInstances() : cls.getDirectInstances()) {
            Instance inst = (Instance) element;
            result.add(OntologyJavaMappingUtil.getSpecificObject(kb, inst, AgreeDisagreeVote.class));
        }
        return result;
    }

    // ***** Class AgreeDisagreeVoteProposal *****

    public Cls getAgreeDisagreeVoteProposalClass() {
        final String name = "AgreeDisagreeVoteProposal";
        return kb.getCls(name);
    }

    public AgreeDisagreeVoteProposal createAgreeDisagreeVoteProposal(String name) {
        Cls cls = getAgreeDisagreeVoteProposalClass();
        Instance inst = cls.createDirectInstance(name);
        return new DefaultAgreeDisagreeVoteProposal(inst);
    }

    public AgreeDisagreeVoteProposal getAgreeDisagreeVoteProposal(String name) {
        return OntologyJavaMappingUtil.getSpecificObject(kb, kb.getInstance(name), AgreeDisagreeVoteProposal.class);
    }

    public Collection<AgreeDisagreeVoteProposal> getAllAgreeDisagreeVoteProposalObjects() {
        return getAllAgreeDisagreeVoteProposalObjects(false);
    }

    public Collection<AgreeDisagreeVoteProposal> getAllAgreeDisagreeVoteProposalObjects(boolean transitive) {
        Collection<AgreeDisagreeVoteProposal> result = new ArrayList<AgreeDisagreeVoteProposal>();
        final Cls cls = getAgreeDisagreeVoteProposalClass();
        for (Object element : transitive ? cls.getInstances() : cls.getDirectInstances()) {
            Instance inst = (Instance) element;
            result.add(OntologyJavaMappingUtil.getSpecificObject(kb, inst, AgreeDisagreeVoteProposal.class));
        }
        return result;
    }

    // ***** Class AnnotatableThing *****

    public Cls getAnnotatableThingClass() {
        final String name = "AnnotatableThing";
        return kb.getCls(name);
    }

    public AnnotatableThing getAnnotatableThing(String name) {
        return OntologyJavaMappingUtil.getSpecificObject(kb, kb.getInstance(name), AnnotatableThing.class);
    }

    public Collection<AnnotatableThing> getAllAnnotatableThingObjects() {
        return getAllAnnotatableThingObjects(false);
    }

    public Collection<AnnotatableThing> getAllAnnotatableThingObjects(boolean transitive) {
        Collection<AnnotatableThing> result = new ArrayList<AnnotatableThing>();
        final Cls cls = getAnnotatableThingClass();
        for (Object element : transitive ? cls.getInstances() : cls.getDirectInstances()) {
            Instance inst = (Instance) element;
            result.add(OntologyJavaMappingUtil.getSpecificObject(kb, inst, AnnotatableThing.class));
        }
        return result;
    }

    // ***** Class Annotation *****

    public Cls getAnnotationClass() {
        final String name = "Annotation";
        return kb.getCls(name);
    }

    public Annotation getAnnotation(String name) {
        return OntologyJavaMappingUtil.getSpecificObject(kb, kb.getInstance(name), Annotation.class);
    }

    public Collection<Annotation> getAllAnnotationObjects() {
        return getAllAnnotationObjects(false);
    }

    public Collection<Annotation> getAllAnnotationObjects(boolean transitive) {
        Collection<Annotation> result = new ArrayList<Annotation>();
        final Cls cls = getAnnotationClass();
        for (Object element : transitive ? cls.getInstances() : cls.getDirectInstances()) {
            Instance inst = (Instance) element;
            result.add(OntologyJavaMappingUtil.getSpecificObject(kb, inst, Annotation.class));
        }
        return result;
    }

    // ***** Class Comment *****

    public Cls getCommentClass() {
        final String name = "Comment";
        return kb.getCls(name);
    }

    public Comment createComment(String name) {
        Cls cls = getCommentClass();
        Instance inst = cls.createDirectInstance(name);
        return new DefaultComment(inst);
    }

    public Comment getComment(String name) {
        return OntologyJavaMappingUtil.getSpecificObject(kb, kb.getInstance(name), Comment.class);
    }

    public Collection<Comment> getAllCommentObjects() {
        return getAllCommentObjects(false);
    }

    public Collection<Comment> getAllCommentObjects(boolean transitive) {
        Collection<Comment> result = new ArrayList<Comment>();
        final Cls cls = getCommentClass();
        for (Object element : transitive ? cls.getInstances() : cls.getDirectInstances()) {
            Instance inst = (Instance) element;
            result.add(OntologyJavaMappingUtil.getSpecificObject(kb, inst, Comment.class));
        }
        return result;
    }

    // ***** Class Example *****

    public Cls getExampleClass() {
        final String name = "Example";
        return kb.getCls(name);
    }

    public Example createExample(String name) {
        Cls cls = getExampleClass();
        Instance inst = cls.createDirectInstance(name);
        return new DefaultExample(inst);
    }

    public Example getExample(String name) {
        return OntologyJavaMappingUtil.getSpecificObject(kb, kb.getInstance(name), Example.class);
    }

    public Collection<Example> getAllExampleObjects() {
        return getAllExampleObjects(false);
    }

    public Collection<Example> getAllExampleObjects(boolean transitive) {
        Collection<Example> result = new ArrayList<Example>();
        final Cls cls = getExampleClass();
        for (Object element : transitive ? cls.getInstances() : cls.getDirectInstances()) {
            Instance inst = (Instance) element;
            result.add(OntologyJavaMappingUtil.getSpecificObject(kb, inst, Example.class));
        }
        return result;
    }

    // ***** Class Explanation *****

    public Cls getExplanationClass() {
        final String name = "Explanation";
        return kb.getCls(name);
    }

    public Explanation createExplanation(String name) {
        Cls cls = getExplanationClass();
        Instance inst = cls.createDirectInstance(name);
        return new DefaultExplanation(inst);
    }

    public Explanation getExplanation(String name) {
        return OntologyJavaMappingUtil.getSpecificObject(kb, kb.getInstance(name), Explanation.class);
    }

    public Collection<Explanation> getAllExplanationObjects() {
        return getAllExplanationObjects(false);
    }

    public Collection<Explanation> getAllExplanationObjects(boolean transitive) {
        Collection<Explanation> result = new ArrayList<Explanation>();
        final Cls cls = getExplanationClass();
        for (Object element : transitive ? cls.getInstances() : cls.getDirectInstances()) {
            Instance inst = (Instance) element;
            result.add(OntologyJavaMappingUtil.getSpecificObject(kb, inst, Explanation.class));
        }
        return result;
    }

    // ***** Class FiveStarsVote *****

    public Cls getFiveStarsVoteClass() {
        final String name = "FiveStarsVote";
        return kb.getCls(name);
    }

    public FiveStarsVote createFiveStarsVote(String name) {
        Cls cls = getFiveStarsVoteClass();
        Instance inst = cls.createDirectInstance(name);
        return new DefaultFiveStarsVote(inst);
    }

    public FiveStarsVote getFiveStarsVote(String name) {
        return OntologyJavaMappingUtil.getSpecificObject(kb, kb.getInstance(name), FiveStarsVote.class);
    }

    public Collection<FiveStarsVote> getAllFiveStarsVoteObjects() {
        return getAllFiveStarsVoteObjects(false);
    }

    public Collection<FiveStarsVote> getAllFiveStarsVoteObjects(boolean transitive) {
        Collection<FiveStarsVote> result = new ArrayList<FiveStarsVote>();
        final Cls cls = getFiveStarsVoteClass();
        for (Object element : transitive ? cls.getInstances() : cls.getDirectInstances()) {
            Instance inst = (Instance) element;
            result.add(OntologyJavaMappingUtil.getSpecificObject(kb, inst, FiveStarsVote.class));
        }
        return result;
    }
 
    // ***** Class Question *****

    public Cls getQuestionClass() {
        final String name = "Question";
        return kb.getCls(name);
    }

    public Question createQuestion(String name) {
        Cls cls = getQuestionClass();
        Instance inst = cls.createDirectInstance(name);
        return new DefaultQuestion(inst);
    }

    public Question getQuestion(String name) {
        return OntologyJavaMappingUtil.getSpecificObject(kb, kb.getInstance(name), Question.class);
    }

    public Collection<Question> getAllQuestionObjects() {
        return getAllQuestionObjects(false);
    }

    public Collection<Question> getAllQuestionObjects(boolean transitive) {
        Collection<Question> result = new ArrayList<Question>();
        final Cls cls = getQuestionClass();
        for (Object element : transitive ? cls.getInstances() : cls.getDirectInstances()) {
            Instance inst = (Instance) element;
            result.add(OntologyJavaMappingUtil.getSpecificObject(kb, inst, Question.class));
        }
        return result;
    }


    // ***** Class SeeAlso *****

    public Cls getSeeAlsoClass() {
        final String name = "SeeAlso";
        return kb.getCls(name);
    }

    public SeeAlso createSeeAlso(String name) {
        Cls cls = getSeeAlsoClass();
        Instance inst = cls.createDirectInstance(name);
        return new DefaultSeeAlso(inst);
    }

    public SeeAlso getSeeAlso(String name) {
        return OntologyJavaMappingUtil.getSpecificObject(kb, kb.getInstance(name), SeeAlso.class);
    }

    public Collection<SeeAlso> getAllSeeAlsoObjects() {
        return getAllSeeAlsoObjects(false);
    }

    public Collection<SeeAlso> getAllSeeAlsoObjects(boolean transitive) {
        Collection<SeeAlso> result = new ArrayList<SeeAlso>();
        final Cls cls = getSeeAlsoClass();
        for (Object element : transitive ? cls.getInstances() : cls.getDirectInstances()) {
            Instance inst = (Instance) element;
            result.add(OntologyJavaMappingUtil.getSpecificObject(kb, inst, SeeAlso.class));
        }
        return result;
    }

 
    // ***** Class Vote *****

    public Cls getVoteClass() {
        final String name = "Vote";
        return kb.getCls(name);
    }

    public Vote getVote(String name) {
        return OntologyJavaMappingUtil.getSpecificObject(kb, kb.getInstance(name), Vote.class);
    }

    public Collection<Vote> getAllVoteObjects() {
        return getAllVoteObjects(false);
    }

    public Collection<Vote> getAllVoteObjects(boolean transitive) {
        Collection<Vote> result = new ArrayList<Vote>();
        final Cls cls = getVoteClass();
        for (Object element : transitive ? cls.getInstances() : cls.getDirectInstances()) {
            Instance inst = (Instance) element;
            result.add(OntologyJavaMappingUtil.getSpecificObject(kb, inst, Vote.class));
        }
        return result;
    }

    // ***** Class VotingProposal *****

    public Cls getVotingProposalClass() {
        final String name = "VotingProposal";
        return kb.getCls(name);
    }

    public VotingProposal getVotingProposal(String name) {
        return OntologyJavaMappingUtil.getSpecificObject(kb, kb.getInstance(name), VotingProposal.class);
    }

    public Collection<VotingProposal> getAllVotingProposalObjects() {
        return getAllVotingProposalObjects(false);
    }

    public Collection<VotingProposal> getAllVotingProposalObjects(boolean transitive) {
        Collection<VotingProposal> result = new ArrayList<VotingProposal>();
        final Cls cls = getVotingProposalClass();
        for (Object element : transitive ? cls.getInstances() : cls.getDirectInstances()) {
            Instance inst = (Instance) element;
            result.add(OntologyJavaMappingUtil.getSpecificObject(kb, inst, VotingProposal.class));
        }
        return result;
    }
    
    
    // ***** Class ChangeHierarchyProposal *****

    public Cls getChangeHierarchyProposalClass() {
        final String name = "ChangeHierarchyProposal";
        return kb.getCls(name);
    }

    public ChangeHierarchyProposal createChangeHierarchyProposal(String name) {
        Cls cls = getChangeHierarchyProposalClass();
        Instance inst = cls.createDirectInstance(name);
        return new DefaultChangeHierarchyProposal(inst);
    }

    public ChangeHierarchyProposal getChangeHierarchyProposal(String name) {
        return OntologyJavaMappingUtil.getSpecificObject(kb, kb.getInstance(name), ChangeHierarchyProposal.class);
    }

    public Collection<ChangeHierarchyProposal> getAllChangeHierarchyProposalObjects() {
        return getAllChangeHierarchyProposalObjects(false);
    }

    public Collection<ChangeHierarchyProposal> getAllChangeHierarchyProposalObjects(boolean transitive) {
        Collection<ChangeHierarchyProposal> result = new ArrayList<ChangeHierarchyProposal>();
        final Cls cls = getChangeHierarchyProposalClass();
        for (Object element : transitive ? cls.getInstances() : cls.getDirectInstances()) {
            Instance inst = (Instance) element;
            result.add(OntologyJavaMappingUtil.getSpecificObject(kb, inst, ChangeHierarchyProposal.class));
        }
        return result;
    }


    // ***** Class FiveStarsVoteProposal *****

    public Cls getFiveStarsVoteProposalClass() {
        final String name = "FiveStarsVoteProposal";
        return kb.getCls(name);
    }

    public FiveStarsVoteProposal createFiveStarsVoteProposal(String name) {
        Cls cls = getFiveStarsVoteProposalClass();
        Instance inst = cls.createDirectInstance(name);
        return new DefaultFiveStarsVoteProposal(inst);
    }

    public FiveStarsVoteProposal getFiveStarsVoteProposal(String name) {
        return OntologyJavaMappingUtil.getSpecificObject(kb, kb.getInstance(name), FiveStarsVoteProposal.class);
    }

    public Collection<FiveStarsVoteProposal> getAllFiveStarsVoteProposalObjects() {
        return getAllFiveStarsVoteProposalObjects(false);
    }

    public Collection<FiveStarsVoteProposal> getAllFiveStarsVoteProposalObjects(boolean transitive) {
        Collection<FiveStarsVoteProposal> result = new ArrayList<FiveStarsVoteProposal>();
        final Cls cls = getFiveStarsVoteProposalClass();
        for (Object element : transitive ? cls.getInstances() : cls.getDirectInstances()) {
            Instance inst = (Instance) element;
            result.add(OntologyJavaMappingUtil.getSpecificObject(kb, inst, FiveStarsVoteProposal.class));
        }
        return result;
    }

    
    // ***** Class LinguisticEntity *****

    public Cls getLinguisticEntityClass() {
        final String name = "LinguisticEntity";
        return kb.getCls(name);
    }

    public LinguisticEntity createLinguisticEntity(String name) {
        Cls cls = getLinguisticEntityClass();
        Instance inst = cls.createDirectInstance(name);
        return new DefaultLinguisticEntity(inst);
    }

    public LinguisticEntity getLinguisticEntity(String name) {
        return OntologyJavaMappingUtil.getSpecificObject(kb, kb.getInstance(name), LinguisticEntity.class);
    }

    public Collection<LinguisticEntity> getAllLinguisticEntityObjects() {
        return getAllLinguisticEntityObjects(false);
    }

    public Collection<LinguisticEntity> getAllLinguisticEntityObjects(boolean transitive) {
        Collection<LinguisticEntity> result = new ArrayList<LinguisticEntity>();
        final Cls cls = getLinguisticEntityClass();
        for (Object element : transitive ? cls.getInstances() : cls.getDirectInstances()) {
            Instance inst = (Instance) element;
            result.add(OntologyJavaMappingUtil.getSpecificObject(kb, inst, LinguisticEntity.class));
        }
        return result;
    }
    

    // ***** Class MergeProposal *****

    public Cls getMergeProposalClass() {
        final String name = "MergeProposal";
        return kb.getCls(name);
    }

    public MergeProposal createMergeProposal(String name) {
        Cls cls = getMergeProposalClass();
        Instance inst = cls.createDirectInstance(name);
        return new DefaultMergeProposal(inst);
    }

    public MergeProposal getMergeProposal(String name) {
        return OntologyJavaMappingUtil.getSpecificObject(kb, kb.getInstance(name), MergeProposal.class);
    }

    public Collection<MergeProposal> getAllMergeProposalObjects() {
        return getAllMergeProposalObjects(false);
    }

    public Collection<MergeProposal> getAllMergeProposalObjects(boolean transitive) {
        Collection<MergeProposal> result = new ArrayList<MergeProposal>();
        final Cls cls = getMergeProposalClass();
        for (Object element : transitive ? cls.getInstances() : cls.getDirectInstances()) {
            Instance inst = (Instance) element;
            result.add(OntologyJavaMappingUtil.getSpecificObject(kb, inst, MergeProposal.class));
        }
        return result;
    }


    // ***** Class NewEntityProposal *****

    public Cls getNewEntityProposalClass() {
        final String name = "NewEntityProposal";
        return kb.getCls(name);
    }

    public NewEntityProposal createNewEntityProposal(String name) {
        Cls cls = getNewEntityProposalClass();
        Instance inst = cls.createDirectInstance(name);
        return new DefaultNewEntityProposal(inst);
    }

    public NewEntityProposal getNewEntityProposal(String name) {
        return OntologyJavaMappingUtil.getSpecificObject(kb, kb.getInstance(name), NewEntityProposal.class);
    }

    public Collection<NewEntityProposal> getAllNewEntityProposalObjects() {
        return getAllNewEntityProposalObjects(false);
    }

    public Collection<NewEntityProposal> getAllNewEntityProposalObjects(boolean transitive) {
        Collection<NewEntityProposal> result = new ArrayList<NewEntityProposal>();
        final Cls cls = getNewEntityProposalClass();
        for (Object element : transitive ? cls.getInstances() : cls.getDirectInstances()) {
            Instance inst = (Instance) element;
            result.add(OntologyJavaMappingUtil.getSpecificObject(kb, inst, NewEntityProposal.class));
        }
        return result;
    }


    // ***** Class PropertyValueChangeProposal *****

    public Cls getPropertyValueChangeProposalClass() {
        final String name = "PropertyValueChangeProposal";
        return kb.getCls(name);
    }

    public PropertyValueChangeProposal createPropertyValueChangeProposal(String name) {
        Cls cls = getPropertyValueChangeProposalClass();
        Instance inst = cls.createDirectInstance(name);
        return new DefaultPropertyValueChangeProposal(inst);
    }

    public PropertyValueChangeProposal getPropertyValueChangeProposal(String name) {
        return OntologyJavaMappingUtil.getSpecificObject(kb, kb.getInstance(name), PropertyValueChangeProposal.class);
    }

    public Collection<PropertyValueChangeProposal> getAllPropertyValueChangeProposalObjects() {
        return getAllPropertyValueChangeProposalObjects(false);
    }

    public Collection<PropertyValueChangeProposal> getAllPropertyValueChangeProposalObjects(boolean transitive) {
        Collection<PropertyValueChangeProposal> result = new ArrayList<PropertyValueChangeProposal>();
        final Cls cls = getPropertyValueChangeProposalClass();
        for (Object element : transitive ? cls.getInstances() : cls.getDirectInstances()) {
            Instance inst = (Instance) element;
            result.add(OntologyJavaMappingUtil.getSpecificObject(kb, inst, PropertyValueChangeProposal.class));
        }
        return result;
    }


    // ***** Class Proposal *****

    public Cls getProposalClass() {
        final String name = "Proposal";
        return kb.getCls(name);
    }

    public Proposal getProposal(String name) {
        return OntologyJavaMappingUtil.getSpecificObject(kb, kb.getInstance(name), Proposal.class);
    }

    public Collection<Proposal> getAllProposalObjects() {
        return getAllProposalObjects(false);
    }

    public Collection<Proposal> getAllProposalObjects(boolean transitive) {
        Collection<Proposal> result = new ArrayList<Proposal>();
        final Cls cls = getProposalClass();
        for (Object element : transitive ? cls.getInstances() : cls.getDirectInstances()) {
            Instance inst = (Instance) element;
            result.add(OntologyJavaMappingUtil.getSpecificObject(kb, inst, Proposal.class));
        }
        return result;
    }


    // ***** Class RetireProposal *****

    public Cls getRetireProposalClass() {
        final String name = "RetireProposal";
        return kb.getCls(name);
    }

    public RetireProposal createRetireProposal(String name) {
        Cls cls = getRetireProposalClass();
        Instance inst = cls.createDirectInstance(name);
        return new DefaultRetireProposal(inst);
    }

    public RetireProposal getRetireProposal(String name) {
        return OntologyJavaMappingUtil.getSpecificObject(kb, kb.getInstance(name), RetireProposal.class);
    }

    public Collection<RetireProposal> getAllRetireProposalObjects() {
        return getAllRetireProposalObjects(false);
    }

    public Collection<RetireProposal> getAllRetireProposalObjects(boolean transitive) {
        Collection<RetireProposal> result = new ArrayList<RetireProposal>();
        final Cls cls = getRetireProposalClass();
        for (Object element : transitive ? cls.getInstances() : cls.getDirectInstances()) {
            Instance inst = (Instance) element;
            result.add(OntologyJavaMappingUtil.getSpecificObject(kb, inst, RetireProposal.class));
        }
        return result;
    }


    // ***** Class Review *****

    public Cls getReviewClass() {
        final String name = "Review";
        return kb.getCls(name);
    }

    public Review createReview(String name) {
        Cls cls = getReviewClass();
        Instance inst = cls.createDirectInstance(name);
        return new DefaultReview(inst);
    }

    public Review getReview(String name) {
        return OntologyJavaMappingUtil.getSpecificObject(kb, kb.getInstance(name), Review.class);
    }

    public Collection<Review> getAllReviewObjects() {
        return getAllReviewObjects(false);
    }

    public Collection<Review> getAllReviewObjects(boolean transitive) {
        Collection<Review> result = new ArrayList<Review>();
        final Cls cls = getReviewClass();
        for (Object element : transitive ? cls.getInstances() : cls.getDirectInstances()) {
            Instance inst = (Instance) element;
            result.add(OntologyJavaMappingUtil.getSpecificObject(kb, inst, Review.class));
        }
        return result;
    }


    // ***** Class ReviewRequest *****

    public Cls getReviewRequestClass() {
        final String name = "ReviewRequest";
        return kb.getCls(name);
    }

    public ReviewRequest createReviewRequest(String name) {
        Cls cls = getReviewRequestClass();
        Instance inst = cls.createDirectInstance(name);
        return new DefaultReviewRequest(inst);
    }

    public ReviewRequest getReviewRequest(String name) {
        return OntologyJavaMappingUtil.getSpecificObject(kb, kb.getInstance(name), ReviewRequest.class);
    }

    public Collection<ReviewRequest> getAllReviewRequestObjects() {
        return getAllReviewRequestObjects(false);
    }

    public Collection<ReviewRequest> getAllReviewRequestObjects(boolean transitive) {
        Collection<ReviewRequest> result = new ArrayList<ReviewRequest>();
        final Cls cls = getReviewRequestClass();
        for (Object element : transitive ? cls.getInstances() : cls.getDirectInstances()) {
            Instance inst = (Instance) element;
            result.add(OntologyJavaMappingUtil.getSpecificObject(kb, inst, ReviewRequest.class));
        }
        return result;
    }


    // ***** Class SimpleProposal *****

    public Cls getSimpleProposalClass() {
        final String name = "SimpleProposal";
        return kb.getCls(name);
    }

    public SimpleProposal createSimpleProposal(String name) {
        Cls cls = getSimpleProposalClass();
        Instance inst = cls.createDirectInstance(name);
        return new DefaultSimpleProposal(inst);
    }

    public SimpleProposal getSimpleProposal(String name) {
        return OntologyJavaMappingUtil.getSpecificObject(kb, kb.getInstance(name), SimpleProposal.class);
    }

    public Collection<SimpleProposal> getAllSimpleProposalObjects() {
        return getAllSimpleProposalObjects(false);
    }

    public Collection<SimpleProposal> getAllSimpleProposalObjects(boolean transitive) {
        Collection<SimpleProposal> result = new ArrayList<SimpleProposal>();
        final Cls cls = getSimpleProposalClass();
        for (Object element : transitive ? cls.getInstances() : cls.getDirectInstances()) {
            Instance inst = (Instance) element;
            result.add(OntologyJavaMappingUtil.getSpecificObject(kb, inst, SimpleProposal.class));
        }
        return result;
    }


    // ***** Class SplitProposal *****

    public Cls getSplitProposalClass() {
        final String name = "SplitProposal";
        return kb.getCls(name);
    }

    public SplitProposal createSplitProposal(String name) {
        Cls cls = getSplitProposalClass();
        Instance inst = cls.createDirectInstance(name);
        return new DefaultSplitProposal(inst);
    }

    public SplitProposal getSplitProposal(String name) {
        return OntologyJavaMappingUtil.getSpecificObject(kb, kb.getInstance(name), SplitProposal.class);
    }

    public Collection<SplitProposal> getAllSplitProposalObjects() {
        return getAllSplitProposalObjects(false);
    }

    public Collection<SplitProposal> getAllSplitProposalObjects(boolean transitive) {
        Collection<SplitProposal> result = new ArrayList<SplitProposal>();
        final Cls cls = getSplitProposalClass();
        for (Object element : transitive ? cls.getInstances() : cls.getDirectInstances()) {
            Instance inst = (Instance) element;
            result.add(OntologyJavaMappingUtil.getSpecificObject(kb, inst, SplitProposal.class));
        }
        return result;
    }


    // ***** Class Status *****

    public Cls getStatusClass() {
        final String name = "Status";
        return kb.getCls(name);
    }

    public Status createStatus(String name) {
        Cls cls = getStatusClass();
        Instance inst = cls.createDirectInstance(name);
        return new DefaultStatus(inst);
    }

    public Status getStatus(String name) {
        return OntologyJavaMappingUtil.getSpecificObject(kb, kb.getInstance(name), Status.class);
    }

    public Collection<Status> getAllStatusObjects() {
        return getAllStatusObjects(false);
    }

    public Collection<Status> getAllStatusObjects(boolean transitive) {
        Collection<Status> result = new ArrayList<Status>();
        final Cls cls = getStatusClass();
        for (Object element : transitive ? cls.getInstances() : cls.getDirectInstances()) {
            Instance inst = (Instance) element;
            result.add(OntologyJavaMappingUtil.getSpecificObject(kb, inst, Status.class));
        }
        return result;
    }

    
    
    
    
    
    
    
    
    

    // ***** Getter methods for slots *****

    public Slot getActionSlot() {
        final String name = "action";
        return kb.getSlot(name);
    }

    public Slot getAnnotatesSlot() {
        final String name = "annotates";
        return kb.getSlot(name);
    }

    public Slot getAssociatedAnnotationsSlot() {
        final String name = "associatedAnnotations";
        return kb.getSlot(name);
    }

    public Slot getApplyToSlot() {
        final String name = "applyTo";
        return kb.getSlot(name);
    }

    public Slot getChangesSlot() {
        final String name = "changes";
        return kb.getSlot(name);
    }

    public Slot getAssociatedPropertySlot() {
        final String name = "associatedProperty";
        return kb.getSlot(name);
    }

    public Slot getAuthorSlot() {
        final String name = "author";
        return kb.getSlot(name);
    }

    public Slot getBodySlot() {
        final String name = "body";
        return kb.getSlot(name);
    }

    public Slot getChanges_Slot_0Slot() {
        final String name = "changes_Slot_0";
        return kb.getSlot(name);
    }

    public Slot getChanges_Slot_1Slot() {
        final String name = "changes_Slot_1";
        return kb.getSlot(name);
    }

    public Slot getCommentSlot() {
        final String name = "comment";
        return kb.getSlot(name);
    }

    public Slot getContextSlot() {
        final String name = "context";
        return kb.getSlot(name);
    }

    public Slot getCreatedSlot() {
        final String name = "created";
        return kb.getSlot(name);
    }

    public Slot getCreationNameSlot() {
        final String name = "creationName";
        return kb.getSlot(name);
    }

    public Slot getCurrentNameSlot() {
        final String name = "currentName";
        return kb.getSlot(name);
    }

    public Slot getDateSlot() {
        final String name = "date";
        return kb.getSlot(name);
    }

    public Slot getInverse_of_annotatesSlot() {
        final String name = "inverse_of_annotates";
        return kb.getSlot(name);
    }

    public Slot getModifiedSlot() {
        final String name = "modified";
        return kb.getSlot(name);
    }

    public Slot getNameSlot() {
        final String name = "name";
        return kb.getSlot(name);
    }
    

    public Slot getEntityIdSlot() {
        final String name = "entityId";
        return kb.getSlot(name);
    }

    public Slot getPartOfCompositeChangeSlot() {
        final String name = "partOfCompositeChange";
        return kb.getSlot(name);
    }

    public Slot getSubChangesSlot() {
        final String name = "subChanges";
        return kb.getSlot(name);
    }

    public Slot getDeadlineSlot() {
        final String name = "deadline";
        return kb.getSlot(name);
    }

    public Slot getDefinitionSlot() {
        final String name = "definition";
        return kb.getSlot(name);
    }

    public Slot getDeletionNameSlot() {
        final String name = "deletionName";
        return kb.getSlot(name);
    }

    public Slot getDomainOfInterestSlot() {
        final String name = "domainOfInterest";
        return kb.getSlot(name);
    }
    
    public Slot getNewNameSlot() {
        final String name = "newName";
        return kb.getSlot(name);
    }

    public Slot getNewParentsSlot() {
        final String name = "newParents";
        return kb.getSlot(name);
    }

    public Slot getNewValueSlot() {
        final String name = "newValue";
        return kb.getSlot(name);
    }

    public Slot getOldNameSlot() {
        final String name = "oldName";
        return kb.getSlot(name);
    }

    public Slot getOldParentsSlot() {
        final String name = "oldParents";
        return kb.getSlot(name);
    }

    public Slot getOldValueSlot() {
        final String name = "oldValue";
        return kb.getSlot(name);
    }

    public Slot getParentSlot() {
        final String name = "parent";
        return kb.getSlot(name);
    }


    public Slot getPreferredNameSlot() {
        final String name = "preferredName";
        return kb.getSlot(name);
    }

    public Slot getPropertySlot() {
        final String name = "property";
        return kb.getSlot(name);
    }

    public Slot getReasonForChangeSlot() {
        final String name = "reasonForChange";
        return kb.getSlot(name);
    }

    public Slot getRelatedSlot() {
        final String name = "related";
        return kb.getSlot(name);
    }

    public Slot getRelationTypeSlot() {
        final String name = "relationType";
        return kb.getSlot(name);
    }

    public Slot getRetiredEntitySlot() {
        final String name = "retiredEntity";
        return kb.getSlot(name);
    }

    public Slot getReviewRequestsSlot() {
        final String name = "reviewRequests";
        return kb.getSlot(name);
    }

    public Slot getReviewerSlot() {
        final String name = "reviewer";
        return kb.getSlot(name);
    }

    public Slot getSequenceSlot() {
        final String name = "sequence";
        return kb.getSlot(name);
    }

    public Slot getSubjectSlot() {
        final String name = "subject";
        return kb.getSlot(name);
    }

    public Slot getSynonymSlot() {
        final String name = "synonym";
        return kb.getSlot(name);
    }

    public Slot getTimestampSlot() {
        final String name = "timestamp";
        return kb.getSlot(name);
    }

    public Slot getTitleSlot() {
        final String name = "title";
        return kb.getSlot(name);
    }

    public Slot getVoteValueSlot() {
        final String name = "voteValue";
        return kb.getSlot(name);
    }

    public Slot getWatchedBySlot() {
        final String name = "watchedBy";
        return kb.getSlot(name);
    }

    public Slot getWatchedEntitySlot() {
        final String name = "watchedEntity";
        return kb.getSlot(name);
    }

    public Slot getHasStatusSlot() {
        final String name = "hasStatus";
        return kb.getSlot(name);
    }

    public Slot getDescriptionSlot() {
        final String name = "description";
        return kb.getSlot(name);
    }
    

    public Slot getLabelSlot() {
        final String name = "label";
        return kb.getSlot(name);
    }

    public Slot getLanguageSlot() {
        final String name = "language";
        return kb.getSlot(name);
    }
 
    public Slot getEntity1Slot() {
        final String name = "entity1";
        return kb.getSlot(name);
    }

    public Slot getEntity2Slot() {
        final String name = "entity2";
        return kb.getSlot(name);
    }
    
    public Slot getCompletedSlot() {
        final String name = "completed";
        return kb.getSlot(name);
    }

    public Slot getContactInformationSlot() {
        final String name = "contactInformation";
        return kb.getSlot(name);
    }
    
    public Slot getArchivedSlot() {
        final String name = "archived";
        return kb.getSlot(name);
    }


    /********* Utility methods ************/

    public Annotation fillDefaultValues(Annotation annotation) {
        annotation.setCreated(DefaultTimestamp.getTimestamp(kb));
        annotation.setAuthor(kb.getUserName());
        return annotation;
    }

    public String getProtegeName(Annotation annotation) {
        if (annotation instanceof AbstractWrappedInstance) {
            return ((AbstractWrappedInstance) annotation).getName();
        }
        return null;
    }

    public Instance getWrappedProtegeInstance(AnnotatableThing thing) {
        if (thing instanceof AbstractWrappedInstance) {
            return ((AbstractWrappedInstance) thing).getWrappedProtegeInstance();
        }
        return null;
    }

    public String getAnnotationType(Annotation annotation) {
        Instance protegeInst = getWrappedProtegeInstance(annotation);
        return protegeInst == null ? null : protegeInst.getDirectType().getBrowserText();
    }

    public static Annotation getGenericAnnotation(Instance wrappedAnnotationInstance) {
        return new DefaultAnnotation(wrappedAnnotationInstance);
    }

}
