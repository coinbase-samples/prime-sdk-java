.PHONY: fetch-spec
fetch-spec:
	@mkdir -p apiSpec
	@curl -fsSL -o apiSpec/prime-public-spec.yaml https://api.prime.coinbase.com/v1/openapi.yaml
