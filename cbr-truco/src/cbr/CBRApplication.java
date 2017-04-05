package cbr;

import jcolibri.cbraplications.StandardCBRApplication;
import jcolibri.cbrcore.CBRCase;
import jcolibri.cbrcore.CBRCaseBase;
import jcolibri.cbrcore.CBRQuery;
import jcolibri.cbrcore.Connector;
import jcolibri.exception.ExecutionException;
import jcolibri.exception.InitializingException;
import jcolibri.method.retrieve.NNretrieval.NNConfig;

import javax.annotation.Generated;
import representation.DescCaso;
import representation.SolCaso;
import jcolibri.method.retrieve.NNretrieval.NNConfig;
import jcolibri.cbrcore.Attribute;
import jcolibri.method.retrieve.RetrievalResult;
import jcolibri.method.retrieve.NNretrieval.NNScoringMethod;
import jcolibri.method.retrieve.selection.SelectCases;
import java.util.Collection;

public class CBRApplication implements StandardCBRApplication {

	@Generated(value = { "ColibriStudio" })
	Connector connector;
	
	@Generated(value = { "ColibriStudio" })
	CBRCaseBase casebase;



	//******************************************************************/
	// Configuration
	//******************************************************************/

	@Override
	public void configure() throws ExecutionException {
		try{
			configureConnector();
			configureCaseBase();
		} catch (Exception e){
			throw new ExecutionException(e);
		}
	}

	/** Configures the connector */
	@Generated(value = { "CS-PTConector" })	
	private void configureConnector() throws InitializingException{
		connector = new jcolibri.connector.PlainTextConnector();
		connector.initFromXMLfile(jcolibri.util.FileIO
				.findFile("config/plainTextConnectorConfig.xml"));
	}

	/** Configures the case base */
	@Generated(value = { "CS-CaseManager" })	
	private void configureCaseBase() throws InitializingException{
		casebase = new jcolibri.casebase.LinearCaseBase();
	}

	//******************************************************************/
	// Similarity
	//******************************************************************/
	
	/** Configures the similarity */
	@Generated(value = { "CS-Similarity" })	
	private NNConfig getSimilarityConfig() {
		NNConfig simConfig = new NNConfig();
		simConfig
				.setDescriptionSimFunction(new jcolibri.method.retrieve.NNretrieval.similarity.global.Average());
		Attribute attribute0 = new Attribute("CasoId", DescCaso.class);
		simConfig
				.addMapping(
						attribute0,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute0, 0.00);
		Attribute attribute1 = new Attribute("PontosMeus", DescCaso.class);
		simConfig
				.addMapping(
						attribute1,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute1, 0.70);
		Attribute attribute2 = new Attribute("PontosAdv", DescCaso.class);
		simConfig
				.addMapping(
						attribute2,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute2, 0.45);
		Attribute attribute3 = new Attribute("Carta1", DescCaso.class);
		simConfig
				.addMapping(
						attribute3,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute3, 0.35);
		Attribute attribute4 = new Attribute("Carta2", DescCaso.class);
		simConfig
				.addMapping(
						attribute4,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute4, 0.50);
		Attribute attribute5 = new Attribute("Carta3", DescCaso.class);
		simConfig
				.addMapping(
						attribute5,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute5, 0.85);
		Attribute attribute6 = new Attribute("RodAtual", DescCaso.class);
		simConfig
				.addMapping(
						attribute6,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute6, 0.60);
		Attribute attribute7 = new Attribute("RodGanhas", DescCaso.class);
		simConfig
				.addMapping(
						attribute7,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute7, 0.85);
		return simConfig;
	}

	//******************************************************************/
	// Methods
	//******************************************************************/
	

	@Generated(value = { "ColibriStudio" })
	@Override
	public CBRCaseBase preCycle() throws ExecutionException {
		casebase.init(connector);
		return casebase;
	}
		
	@Generated(value = { "ColibriStudio" })	
	@Override
	public void cycle(CBRQuery query) throws ExecutionException {
		NNConfig simConfig = getSimilarityConfig();
		Collection<RetrievalResult> eval = NNScoringMethod.evaluateSimilarity(
				casebase.getCases(), query, simConfig);
		eval = SelectCases.selectTopKRR(eval, 5);
		System.out.println("Retrieved cases:");
		for (RetrievalResult nse : eval)
			System.out.println(nse);
	}

	@Generated(value = { "ColibriStudio" })
	@Override
	public void postCycle() throws ExecutionException {
		connector.close();
	}

	/**
	 * Main method
	 */
	@Generated(value = { "ColibriStudio" })
	public static void main(String[] args) {
		CBRApplication cbrApp = new CBRApplication();
		try {
					
			cbrApp.configure();
			cbrApp.preCycle();

			CBRQuery query = new CBRQuery();
			query.setDescription(new DescCaso());
			jcolibri.method.gui.formFilling.ObtainQueryWithFormMethod.obtainQueryWithoutInitialValues(query, null, null);
			cbrApp.cycle(query);
			cbrApp.postCycle();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

	}
}
