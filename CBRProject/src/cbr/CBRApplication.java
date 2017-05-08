package cbr;

import controller.CBRController;
import java.util.Collection;
import java.util.LinkedList;

import javax.annotation.Generated;

import jcolibri.cbraplications.StandardCBRApplication;
import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CBRCase;
import jcolibri.cbrcore.CBRCaseBase;
import jcolibri.cbrcore.CBRQuery;
import jcolibri.cbrcore.Connector;
import jcolibri.exception.ExecutionException;
import jcolibri.exception.InitializingException;
import jcolibri.method.retrieve.RetrievalResult;
import jcolibri.method.retrieve.NNretrieval.NNConfig;
import jcolibri.method.retrieve.NNretrieval.NNScoringMethod;
import jcolibri.method.retrieve.selection.SelectCases;
import representation.DescCaso;

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
		simConfig.setDescriptionSimFunction(new jcolibri.method.retrieve.NNretrieval.similarity.global.Average());
                
		Attribute attribute0 = new Attribute("PontosAdv", DescCaso.class);
		simConfig.addMapping(attribute0, new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute0, 1.00);
                
		Attribute attribute1 = new Attribute("PontosMeus", DescCaso.class);
		simConfig.addMapping(attribute1, new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute1, 1.00);
                
		Attribute attribute2 = new Attribute("Carta3", DescCaso.class);
		simConfig.addMapping(attribute2, new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute2, 1.00);
                
		Attribute attribute3 = new Attribute("Carta2", DescCaso.class);
		simConfig.addMapping(attribute3, new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute3, 1.00);
                
		Attribute attribute4 = new Attribute("CasoId", DescCaso.class);
		simConfig.addMapping(attribute4, new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute4, 0.00);
                
		Attribute attribute5 = new Attribute("Carta1", DescCaso.class);
		simConfig.addMapping(attribute5, new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute5, 1.00);
                
		Attribute attribute18 = new Attribute("GanheiEnvido", DescCaso.class);
		simConfig.addMapping(attribute18, new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute18, 1.00);
                
		Attribute attribute19 = new Attribute("GanheiVolta", DescCaso.class);
		simConfig.addMapping(attribute19, new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute19, 1.00);
                
		Attribute attribute6 = new Attribute("R1CartaMinha", DescCaso.class);
		simConfig.addMapping(attribute6, new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute6, 1.00);
                
		Attribute attribute7 = new Attribute("R1CartaAdv", DescCaso.class);
		simConfig.addMapping(attribute7, new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute7, 1.00);
                
		Attribute attribute8 = new Attribute("R1PediuEnvido", DescCaso.class);
		simConfig.addMapping(attribute8, new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute8, 1.00);
                
		Attribute attribute9 = new Attribute("R1AceitouEnvido", DescCaso.class);
		simConfig.addMapping(attribute9, new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute9, 1.00);
                
		Attribute attribute10 = new Attribute("R1PediuTruco", DescCaso.class);
		simConfig.addMapping(attribute10, new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute10, 1.00);
                
		Attribute attribute11 = new Attribute("R1AceitouTruco", DescCaso.class);
		simConfig.addMapping(attribute11, new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute11, 1.00);
                
		Attribute attribute12 = new Attribute("R1PediuRetruco", DescCaso.class);
		simConfig.addMapping(attribute12, new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute12, 1.00);
                
		Attribute attribute13 = new Attribute("R1AceitouRetruco", DescCaso.class);
		simConfig.addMapping(attribute13, new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute13, 1.00);
                
		Attribute attribute14 = new Attribute("R1PediuValeQuatro", DescCaso.class);
		simConfig.addMapping(attribute14, new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute14, 1.00);
                
		Attribute attribute15 = new Attribute("R1AceitouValeQuatro", DescCaso.class);
		simConfig.addMapping(attribute15, new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute15, 1.00);
                
		Attribute attribute16 = new Attribute("R2CartaMinha", DescCaso.class);
		simConfig.addMapping(attribute16, new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute16, 1.00);
                
		Attribute attribute17 = new Attribute("R2CartaAdv", DescCaso.class);
		simConfig.addMapping(attribute17, new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute17, 1.00);
                
		Attribute attribute20 = new Attribute("R2PediuTruco", DescCaso.class);
		simConfig.addMapping(attribute20, new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute20, 1.00);
                
		Attribute attribute21 = new Attribute("R2AceitouTruco", DescCaso.class);
		simConfig.addMapping(attribute21, new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute21, 1.00);
                
		Attribute attribute22 = new Attribute("R2PediuRetruco", DescCaso.class);
		simConfig.addMapping(attribute22, new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute22, 1.00);
                
		Attribute attribute23 = new Attribute("R2AceitouRetruco", DescCaso.class);
		simConfig.addMapping(attribute23, new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute23, 1.00);
                
		Attribute attribute24 = new Attribute("R2PediuValeQuatro", DescCaso.class);
		simConfig.addMapping(attribute24, new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute24, 1.00);
                
		Attribute attribute25 = new Attribute("R2AceitouValeQuatro", DescCaso.class);
		simConfig.addMapping(attribute25, new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute25, 1.00);
                
		Attribute attribute26 = new Attribute("R3CartaMinha", DescCaso.class);
		simConfig.addMapping(attribute26, new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute26, 1.00);
                
		Attribute attribute27 = new Attribute("R3CartaAdv", DescCaso.class);
		simConfig.addMapping(attribute27, new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute27, 1.00);
                
		Attribute attribute30 = new Attribute("R3PediuTruco", DescCaso.class);
		simConfig.addMapping(attribute30, new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute30, 1.00);
                
		Attribute attribute31 = new Attribute("R3AceitouTruco", DescCaso.class);
		simConfig.addMapping(attribute31, new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute31, 1.00);
                
		Attribute attribute32 = new Attribute("R3PediuRetruco", DescCaso.class);
		simConfig.addMapping(attribute32, new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute32, 1.00);
                
		Attribute attribute33 = new Attribute("R3AceitouRetruco", DescCaso.class);
		simConfig.addMapping(attribute33, new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute33, 1.00);
                
		Attribute attribute34 = new Attribute("R3PediuValeQuatro", DescCaso.class);
		simConfig.addMapping(attribute34, new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute34, 1.00);
                
		Attribute attribute35 = new Attribute("R3AceitouValeQuatro", DescCaso.class);
		simConfig.addMapping(attribute35, new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute35, 1.00);
                
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
        
        public LinkedList<CBRCase> retornaCasos(){                
            return (LinkedList<CBRCase>) casebase.getCases();
        }

	/**
	 * Main method
	 */
	@Generated(value = { "ColibriStudio" })
	public static void main(String[] args) {
            CBRController c = new CBRController(new DescCaso(), new CBRApplication());
	}
}
